package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_159 {
    private final Production54_159 production = new Production54_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}