package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_328 {
    private final Production54_328 production = new Production54_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}