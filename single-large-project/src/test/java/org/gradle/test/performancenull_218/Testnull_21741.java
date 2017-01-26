package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21741 {
    private final Productionnull_21741 production = new Productionnull_21741("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}