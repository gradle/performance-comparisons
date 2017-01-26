package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_132 {
    private final Production54_132 production = new Production54_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}