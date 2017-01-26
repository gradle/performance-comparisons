package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_345 {
    private final Production54_345 production = new Production54_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}