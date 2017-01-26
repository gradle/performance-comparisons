package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_194 {
    private final Production54_194 production = new Production54_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}