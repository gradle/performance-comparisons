package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_250 {
    private final Production54_250 production = new Production54_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}