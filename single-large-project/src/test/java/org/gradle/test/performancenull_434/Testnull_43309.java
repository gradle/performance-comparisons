package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43309 {
    private final Productionnull_43309 production = new Productionnull_43309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}