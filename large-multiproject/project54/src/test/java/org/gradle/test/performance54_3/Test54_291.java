package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_291 {
    private final Production54_291 production = new Production54_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}