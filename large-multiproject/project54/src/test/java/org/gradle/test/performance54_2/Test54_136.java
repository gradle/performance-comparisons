package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_136 {
    private final Production54_136 production = new Production54_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}