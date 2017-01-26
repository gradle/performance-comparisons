package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_249 {
    private final Production54_249 production = new Production54_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}