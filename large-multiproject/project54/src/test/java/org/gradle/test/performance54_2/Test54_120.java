package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_120 {
    private final Production54_120 production = new Production54_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}