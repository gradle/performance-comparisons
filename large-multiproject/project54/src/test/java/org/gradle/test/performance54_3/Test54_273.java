package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_273 {
    private final Production54_273 production = new Production54_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}