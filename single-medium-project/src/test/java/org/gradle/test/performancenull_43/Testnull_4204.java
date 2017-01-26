package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4204 {
    private final Productionnull_4204 production = new Productionnull_4204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}