package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_312 {
    private final Production54_312 production = new Production54_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}