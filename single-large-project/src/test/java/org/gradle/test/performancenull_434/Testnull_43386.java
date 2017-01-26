package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43386 {
    private final Productionnull_43386 production = new Productionnull_43386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}