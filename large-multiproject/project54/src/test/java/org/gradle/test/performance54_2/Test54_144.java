package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_144 {
    private final Production54_144 production = new Production54_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}