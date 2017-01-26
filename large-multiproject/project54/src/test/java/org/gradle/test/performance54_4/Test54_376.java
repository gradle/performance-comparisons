package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_376 {
    private final Production54_376 production = new Production54_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}