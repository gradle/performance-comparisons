package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_256 {
    private final Production54_256 production = new Production54_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}