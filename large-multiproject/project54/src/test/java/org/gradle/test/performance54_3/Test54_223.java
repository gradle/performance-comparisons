package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_223 {
    private final Production54_223 production = new Production54_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}