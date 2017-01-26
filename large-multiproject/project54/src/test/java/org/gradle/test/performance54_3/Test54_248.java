package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_248 {
    private final Production54_248 production = new Production54_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}