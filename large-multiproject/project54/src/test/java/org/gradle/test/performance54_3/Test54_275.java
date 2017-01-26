package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_275 {
    private final Production54_275 production = new Production54_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}