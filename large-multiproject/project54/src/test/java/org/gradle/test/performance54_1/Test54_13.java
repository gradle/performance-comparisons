package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_13 {
    private final Production54_13 production = new Production54_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}