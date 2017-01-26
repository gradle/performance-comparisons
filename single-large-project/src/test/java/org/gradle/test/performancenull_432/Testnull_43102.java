package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43102 {
    private final Productionnull_43102 production = new Productionnull_43102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}