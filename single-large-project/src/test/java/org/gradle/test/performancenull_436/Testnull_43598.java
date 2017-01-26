package org.gradle.test.performancenull_436;

import static org.junit.Assert.*;

public class Testnull_43598 {
    private final Productionnull_43598 production = new Productionnull_43598("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}