package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_264 {
    private final Production23_264 production = new Production23_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}