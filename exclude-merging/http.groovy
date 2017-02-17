/**
 * This script is used to simulate a remote HTTP server, by introducing an arbitrary latency
 * for each request. It's worth noting that the latency is a _mean_ latency, so if you run
 * the script with:
 *
 * $ groovy http.groovy 50
 *
 * then the latency would range from 0 to 100ms
 *
 * WARNING: The default Groovy distribution includes an outdated servlet-api.jar in the lib
 * directory. You need to remove it for this script to run!
 */

import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.*
import groovy.servlet.*
import javax.servlet.http.*

@Grapes([
        @Grab('org.eclipse.jetty:jetty-server:9.4.1.v20170120'),
        @Grab('org.eclipse.jetty:jetty-servlet:9.4.1.v20170120'),
        @Grab('javax.servlet:javax.servlet-api:3.1.0'),
        @GrabExclude('org.eclipse.jetty.orbit:javax.servlet'),
        @GrabConfig(systemClassLoader=true)
])
def startJetty(String... args) {
    def server = new Server(8000)

    def handler = new ServletContextHandler(ServletContextHandler.SESSIONS)
    handler.contextPath = '/'
    handler.resourceBase = '.'
    def filesHolder = handler.addServlet(LatencyServlet, '/')
    filesHolder.setInitParameter('resourceBase', './repository')
    filesHolder.setInitParameter('latency', args ? args[0] : '0')

    server.handler = handler
    server.start()
}

println "Starting Jetty, press Ctrl+C to stop."
startJetty(args)

class LatencyServlet extends DefaultServlet {
    private final Random rnd = new Random()
    private int latency = -1

    private int getLatency() {
        if (latency == -1) {
            latency = Integer.valueOf(getInitParameter('latency'))
        }
        latency?rnd.nextInt(2*latency):0
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        Thread.sleep(getLatency())
        println "${request.method} ${request.requestURL}"
        super.doGet(request, response)
    }
}