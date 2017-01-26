package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21939 {
    private final Productionnull_21939 production = new Productionnull_21939("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}