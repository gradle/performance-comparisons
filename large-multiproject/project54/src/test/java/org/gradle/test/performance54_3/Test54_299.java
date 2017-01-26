package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_299 {
    private final Production54_299 production = new Production54_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}