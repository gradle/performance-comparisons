package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_319 {
    private final Production54_319 production = new Production54_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}