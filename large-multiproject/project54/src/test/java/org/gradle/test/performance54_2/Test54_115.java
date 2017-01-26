package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_115 {
    private final Production54_115 production = new Production54_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}