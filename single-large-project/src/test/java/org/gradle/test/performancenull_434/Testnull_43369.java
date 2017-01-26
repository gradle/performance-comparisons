package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43369 {
    private final Productionnull_43369 production = new Productionnull_43369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}