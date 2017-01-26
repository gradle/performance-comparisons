package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43476 {
    private final Productionnull_43476 production = new Productionnull_43476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}