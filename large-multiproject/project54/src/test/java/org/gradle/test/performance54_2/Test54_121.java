package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_121 {
    private final Production54_121 production = new Production54_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}