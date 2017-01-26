package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_274 {
    private final Production54_274 production = new Production54_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}