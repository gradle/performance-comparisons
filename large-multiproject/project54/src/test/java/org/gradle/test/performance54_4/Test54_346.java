package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_346 {
    private final Production54_346 production = new Production54_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}