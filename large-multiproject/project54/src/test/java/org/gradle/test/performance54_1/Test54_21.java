package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_21 {
    private final Production54_21 production = new Production54_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}