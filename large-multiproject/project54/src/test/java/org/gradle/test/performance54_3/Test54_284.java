package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_284 {
    private final Production54_284 production = new Production54_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}