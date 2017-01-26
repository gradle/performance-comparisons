package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_184 {
    private final Production54_184 production = new Production54_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}