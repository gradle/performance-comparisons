package org.gradle.test.performancenull_190;

import static org.junit.Assert.*;

public class Testnull_18946 {
    private final Productionnull_18946 production = new Productionnull_18946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}