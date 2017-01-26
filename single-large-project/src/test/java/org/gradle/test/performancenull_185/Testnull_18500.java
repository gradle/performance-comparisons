package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18500 {
    private final Productionnull_18500 production = new Productionnull_18500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}