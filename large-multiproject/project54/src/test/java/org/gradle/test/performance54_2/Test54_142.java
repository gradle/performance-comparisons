package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_142 {
    private final Production54_142 production = new Production54_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}