package org.gradle.test.performancenull_436;

import static org.junit.Assert.*;

public class Testnull_43529 {
    private final Productionnull_43529 production = new Productionnull_43529("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}