package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4219 {
    private final Productionnull_4219 production = new Productionnull_4219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}