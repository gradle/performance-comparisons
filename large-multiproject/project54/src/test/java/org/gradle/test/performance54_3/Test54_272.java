package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_272 {
    private final Production54_272 production = new Production54_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}