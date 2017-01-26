package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_290 {
    private final Production54_290 production = new Production54_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}