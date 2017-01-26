package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_454 {
    private final Production54_454 production = new Production54_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}