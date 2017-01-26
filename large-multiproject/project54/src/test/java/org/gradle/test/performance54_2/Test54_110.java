package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_110 {
    private final Production54_110 production = new Production54_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}