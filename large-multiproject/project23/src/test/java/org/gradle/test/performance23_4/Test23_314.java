package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_314 {
    private final Production23_314 production = new Production23_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}