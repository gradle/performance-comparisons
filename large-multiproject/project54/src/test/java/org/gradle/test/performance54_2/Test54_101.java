package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_101 {
    private final Production54_101 production = new Production54_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}