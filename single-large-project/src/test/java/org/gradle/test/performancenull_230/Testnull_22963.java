package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22963 {
    private final Productionnull_22963 production = new Productionnull_22963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}