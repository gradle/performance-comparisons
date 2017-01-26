package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_79 {
    private final Production54_79 production = new Production54_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}