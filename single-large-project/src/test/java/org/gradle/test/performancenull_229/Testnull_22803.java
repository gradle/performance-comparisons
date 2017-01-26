package org.gradle.test.performancenull_229;

import static org.junit.Assert.*;

public class Testnull_22803 {
    private final Productionnull_22803 production = new Productionnull_22803("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}