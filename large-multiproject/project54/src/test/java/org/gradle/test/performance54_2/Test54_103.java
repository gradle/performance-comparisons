package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_103 {
    private final Production54_103 production = new Production54_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}