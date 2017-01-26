package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43385 {
    private final Productionnull_43385 production = new Productionnull_43385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}