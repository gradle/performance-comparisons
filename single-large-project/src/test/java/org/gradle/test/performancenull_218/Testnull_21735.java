package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21735 {
    private final Productionnull_21735 production = new Productionnull_21735("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}