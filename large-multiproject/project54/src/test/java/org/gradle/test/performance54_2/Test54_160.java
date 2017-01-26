package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_160 {
    private final Production54_160 production = new Production54_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}