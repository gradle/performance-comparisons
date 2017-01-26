package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_420 {
    private final Production54_420 production = new Production54_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}