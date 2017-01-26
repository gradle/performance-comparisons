package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4275 {
    private final Productionnull_4275 production = new Productionnull_4275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}