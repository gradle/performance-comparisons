package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_428 {
    private final Production54_428 production = new Production54_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}