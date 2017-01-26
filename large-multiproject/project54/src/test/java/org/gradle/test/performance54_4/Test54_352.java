package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_352 {
    private final Production54_352 production = new Production54_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}