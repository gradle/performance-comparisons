package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42227 {
    private final Productionnull_42227 production = new Productionnull_42227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}