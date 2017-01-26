package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19978 {
    private final Productionnull_19978 production = new Productionnull_19978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}