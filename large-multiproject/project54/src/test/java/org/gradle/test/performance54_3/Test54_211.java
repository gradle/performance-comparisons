package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_211 {
    private final Production54_211 production = new Production54_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}