package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_24 {
    private final Production54_24 production = new Production54_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}