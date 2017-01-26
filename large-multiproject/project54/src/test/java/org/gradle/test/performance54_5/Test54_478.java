package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_478 {
    private final Production54_478 production = new Production54_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}