package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_491 {
    private final Production54_491 production = new Production54_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}