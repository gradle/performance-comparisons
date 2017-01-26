package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43184 {
    private final Productionnull_43184 production = new Productionnull_43184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}