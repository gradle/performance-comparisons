package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_394 {
    private final Production54_394 production = new Production54_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}