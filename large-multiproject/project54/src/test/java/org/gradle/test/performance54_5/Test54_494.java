package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_494 {
    private final Production54_494 production = new Production54_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}