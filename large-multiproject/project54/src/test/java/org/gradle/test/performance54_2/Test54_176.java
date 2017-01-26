package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_176 {
    private final Production54_176 production = new Production54_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}