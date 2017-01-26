package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_451 {
    private final Production54_451 production = new Production54_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}