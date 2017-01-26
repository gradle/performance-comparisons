package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_170 {
    private final Production54_170 production = new Production54_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}