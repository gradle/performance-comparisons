package org.gradle.test.performancenull_135;

import static org.junit.Assert.*;

public class Testnull_13421 {
    private final Productionnull_13421 production = new Productionnull_13421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}