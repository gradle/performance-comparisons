package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23876 {
    private final Productionnull_23876 production = new Productionnull_23876("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}