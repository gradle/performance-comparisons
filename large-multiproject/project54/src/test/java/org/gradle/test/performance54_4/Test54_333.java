package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_333 {
    private final Production54_333 production = new Production54_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}