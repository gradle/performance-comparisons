package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_430 {
    private final Production54_430 production = new Production54_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}