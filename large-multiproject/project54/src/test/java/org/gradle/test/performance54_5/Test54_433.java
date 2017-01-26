package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_433 {
    private final Production54_433 production = new Production54_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}