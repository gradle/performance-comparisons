package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_152 {
    private final Production54_152 production = new Production54_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}