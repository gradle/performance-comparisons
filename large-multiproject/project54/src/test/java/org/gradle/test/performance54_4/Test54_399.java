package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_399 {
    private final Production54_399 production = new Production54_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}