package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_105 {
    private final Production54_105 production = new Production54_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}