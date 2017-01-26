package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_141 {
    private final Production54_141 production = new Production54_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}