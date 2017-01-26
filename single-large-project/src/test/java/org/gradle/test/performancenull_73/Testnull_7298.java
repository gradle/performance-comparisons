package org.gradle.test.performancenull_73;

import static org.junit.Assert.*;

public class Testnull_7298 {
    private final Productionnull_7298 production = new Productionnull_7298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}