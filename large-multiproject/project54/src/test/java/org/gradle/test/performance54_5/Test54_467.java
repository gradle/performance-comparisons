package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_467 {
    private final Production54_467 production = new Production54_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}