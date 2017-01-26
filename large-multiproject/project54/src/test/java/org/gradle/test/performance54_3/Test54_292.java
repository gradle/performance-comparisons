package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_292 {
    private final Production54_292 production = new Production54_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}