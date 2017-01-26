package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_327 {
    private final Production54_327 production = new Production54_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}