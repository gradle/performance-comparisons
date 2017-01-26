package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43395 {
    private final Productionnull_43395 production = new Productionnull_43395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}