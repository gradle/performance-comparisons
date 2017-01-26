package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_197 {
    private final Production54_197 production = new Production54_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}