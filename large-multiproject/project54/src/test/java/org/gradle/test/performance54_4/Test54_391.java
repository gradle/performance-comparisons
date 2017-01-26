package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_391 {
    private final Production54_391 production = new Production54_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}