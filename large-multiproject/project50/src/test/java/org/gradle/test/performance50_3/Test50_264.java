package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_264 {
    private final Production50_264 production = new Production50_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}