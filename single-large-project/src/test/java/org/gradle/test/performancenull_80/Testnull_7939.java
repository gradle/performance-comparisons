package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7939 {
    private final Productionnull_7939 production = new Productionnull_7939("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}