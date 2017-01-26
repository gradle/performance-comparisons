package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_264 {
    private final Production54_264 production = new Production54_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}