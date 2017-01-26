package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_153 {
    private final Production54_153 production = new Production54_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}