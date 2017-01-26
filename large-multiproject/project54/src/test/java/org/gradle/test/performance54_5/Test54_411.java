package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_411 {
    private final Production54_411 production = new Production54_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}