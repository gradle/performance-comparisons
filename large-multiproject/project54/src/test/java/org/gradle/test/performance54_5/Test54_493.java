package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_493 {
    private final Production54_493 production = new Production54_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}