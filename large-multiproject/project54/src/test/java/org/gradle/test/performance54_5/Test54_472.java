package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_472 {
    private final Production54_472 production = new Production54_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}