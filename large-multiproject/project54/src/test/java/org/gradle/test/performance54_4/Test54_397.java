package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_397 {
    private final Production54_397 production = new Production54_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}