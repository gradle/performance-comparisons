package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_287 {
    private final Production54_287 production = new Production54_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}