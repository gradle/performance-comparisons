package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_130 {
    private final Production54_130 production = new Production54_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}