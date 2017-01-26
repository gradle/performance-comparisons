package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5939 {
    private final Productionnull_5939 production = new Productionnull_5939("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}