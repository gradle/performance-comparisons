package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43106 {
    private final Productionnull_43106 production = new Productionnull_43106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}