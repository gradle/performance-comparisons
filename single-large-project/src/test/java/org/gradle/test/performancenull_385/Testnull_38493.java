package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38493 {
    private final Productionnull_38493 production = new Productionnull_38493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}