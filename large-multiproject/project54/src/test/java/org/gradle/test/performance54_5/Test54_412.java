package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_412 {
    private final Production54_412 production = new Production54_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}