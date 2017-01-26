package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43488 {
    private final Productionnull_43488 production = new Productionnull_43488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}