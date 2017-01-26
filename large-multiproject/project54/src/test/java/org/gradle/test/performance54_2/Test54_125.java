package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_125 {
    private final Production54_125 production = new Production54_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}