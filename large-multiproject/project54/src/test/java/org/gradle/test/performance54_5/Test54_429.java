package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_429 {
    private final Production54_429 production = new Production54_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}