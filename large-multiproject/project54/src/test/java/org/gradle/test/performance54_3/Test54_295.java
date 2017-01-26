package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_295 {
    private final Production54_295 production = new Production54_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}