package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_258 {
    private final Production54_258 production = new Production54_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}