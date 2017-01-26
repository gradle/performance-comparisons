package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_359 {
    private final Production54_359 production = new Production54_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}