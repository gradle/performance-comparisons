package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_20 {
    private final Production54_20 production = new Production54_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}