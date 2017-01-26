package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_344 {
    private final Production54_344 production = new Production54_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}