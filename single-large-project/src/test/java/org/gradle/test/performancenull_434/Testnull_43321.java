package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43321 {
    private final Productionnull_43321 production = new Productionnull_43321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}