package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_117 {
    private final Production54_117 production = new Production54_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}