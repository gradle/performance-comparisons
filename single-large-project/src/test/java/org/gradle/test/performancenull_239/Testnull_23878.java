package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23878 {
    private final Productionnull_23878 production = new Productionnull_23878("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}