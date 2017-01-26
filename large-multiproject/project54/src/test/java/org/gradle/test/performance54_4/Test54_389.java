package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_389 {
    private final Production54_389 production = new Production54_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}