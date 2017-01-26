package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33227 {
    private final Productionnull_33227 production = new Productionnull_33227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}