package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_201 {
    private final Production54_201 production = new Production54_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}