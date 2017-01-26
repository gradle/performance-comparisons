package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_340 {
    private final Production54_340 production = new Production54_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}