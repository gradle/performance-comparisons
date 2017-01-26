package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_276 {
    private final Production54_276 production = new Production54_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}