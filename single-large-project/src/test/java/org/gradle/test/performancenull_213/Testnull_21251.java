package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21251 {
    private final Productionnull_21251 production = new Productionnull_21251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}