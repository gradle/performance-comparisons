package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_124 {
    private final Production54_124 production = new Production54_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}