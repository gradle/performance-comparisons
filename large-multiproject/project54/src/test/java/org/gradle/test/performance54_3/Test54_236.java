package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_236 {
    private final Production54_236 production = new Production54_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}