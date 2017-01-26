package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17055 {
    private final Productionnull_17055 production = new Productionnull_17055("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}