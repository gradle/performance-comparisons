package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_128 {
    private final Production54_128 production = new Production54_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}