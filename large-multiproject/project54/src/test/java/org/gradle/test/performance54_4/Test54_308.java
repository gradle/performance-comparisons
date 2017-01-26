package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_308 {
    private final Production54_308 production = new Production54_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}