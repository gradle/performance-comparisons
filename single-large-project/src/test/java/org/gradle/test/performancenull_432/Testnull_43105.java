package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43105 {
    private final Productionnull_43105 production = new Productionnull_43105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}