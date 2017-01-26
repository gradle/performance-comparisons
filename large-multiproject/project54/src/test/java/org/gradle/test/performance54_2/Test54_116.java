package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_116 {
    private final Production54_116 production = new Production54_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}