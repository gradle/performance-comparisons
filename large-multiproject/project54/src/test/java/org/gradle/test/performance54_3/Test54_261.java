package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_261 {
    private final Production54_261 production = new Production54_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}