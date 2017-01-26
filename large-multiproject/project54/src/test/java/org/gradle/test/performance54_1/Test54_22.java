package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_22 {
    private final Production54_22 production = new Production54_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}