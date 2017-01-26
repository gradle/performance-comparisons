package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_278 {
    private final Production54_278 production = new Production54_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}