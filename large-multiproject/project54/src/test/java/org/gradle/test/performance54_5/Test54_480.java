package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_480 {
    private final Production54_480 production = new Production54_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}