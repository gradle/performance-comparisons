package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23500 {
    private final Productionnull_23500 production = new Productionnull_23500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}