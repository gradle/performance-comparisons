package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18173 {
    private final Productionnull_18173 production = new Productionnull_18173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}