package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_410 {
    private final Production54_410 production = new Production54_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}