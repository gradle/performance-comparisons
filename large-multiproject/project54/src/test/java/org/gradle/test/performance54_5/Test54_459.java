package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_459 {
    private final Production54_459 production = new Production54_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}