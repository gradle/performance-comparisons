package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_233 {
    private final Production54_233 production = new Production54_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}