package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_56 {
    private final Production54_56 production = new Production54_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}