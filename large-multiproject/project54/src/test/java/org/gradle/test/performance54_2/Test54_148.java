package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_148 {
    private final Production54_148 production = new Production54_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}