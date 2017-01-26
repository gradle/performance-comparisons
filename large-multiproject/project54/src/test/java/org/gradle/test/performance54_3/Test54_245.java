package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_245 {
    private final Production54_245 production = new Production54_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}