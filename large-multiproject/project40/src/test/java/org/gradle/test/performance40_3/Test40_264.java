package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_264 {
    private final Production40_264 production = new Production40_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}