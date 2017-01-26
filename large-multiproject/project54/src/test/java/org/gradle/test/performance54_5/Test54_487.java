package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_487 {
    private final Production54_487 production = new Production54_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}