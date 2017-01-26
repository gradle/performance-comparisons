package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23846 {
    private final Productionnull_23846 production = new Productionnull_23846("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}