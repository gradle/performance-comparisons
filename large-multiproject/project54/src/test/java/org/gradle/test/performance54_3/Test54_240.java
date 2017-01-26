package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_240 {
    private final Production54_240 production = new Production54_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}