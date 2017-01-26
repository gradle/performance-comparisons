package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_179 {
    private final Production54_179 production = new Production54_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}