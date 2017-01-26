package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22947 {
    private final Productionnull_22947 production = new Productionnull_22947("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}