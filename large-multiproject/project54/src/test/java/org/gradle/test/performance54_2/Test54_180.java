package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_180 {
    private final Production54_180 production = new Production54_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}