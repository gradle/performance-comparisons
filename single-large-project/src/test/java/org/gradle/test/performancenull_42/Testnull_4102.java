package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4102 {
    private final Productionnull_4102 production = new Productionnull_4102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}