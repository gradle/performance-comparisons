package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_262 {
    private final Production54_262 production = new Production54_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}