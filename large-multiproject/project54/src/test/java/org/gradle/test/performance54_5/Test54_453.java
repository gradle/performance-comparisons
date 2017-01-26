package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_453 {
    private final Production54_453 production = new Production54_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}