package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_408 {
    private final Production54_408 production = new Production54_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}