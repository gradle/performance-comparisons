package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_438 {
    private final Production54_438 production = new Production54_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}