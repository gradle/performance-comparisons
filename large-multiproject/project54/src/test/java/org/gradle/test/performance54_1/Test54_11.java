package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_11 {
    private final Production54_11 production = new Production54_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}