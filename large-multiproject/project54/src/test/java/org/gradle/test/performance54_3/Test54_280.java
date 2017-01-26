package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_280 {
    private final Production54_280 production = new Production54_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}