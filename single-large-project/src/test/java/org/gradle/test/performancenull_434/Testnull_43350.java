package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43350 {
    private final Productionnull_43350 production = new Productionnull_43350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}