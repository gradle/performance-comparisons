package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_156 {
    private final Production54_156 production = new Production54_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}