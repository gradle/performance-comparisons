package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_485 {
    private final Production54_485 production = new Production54_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}