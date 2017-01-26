package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_372 {
    private final Production54_372 production = new Production54_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}