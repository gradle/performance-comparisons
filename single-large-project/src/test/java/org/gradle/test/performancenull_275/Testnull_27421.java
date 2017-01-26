package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27421 {
    private final Productionnull_27421 production = new Productionnull_27421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}