package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_118 {
    private final Production54_118 production = new Production54_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}