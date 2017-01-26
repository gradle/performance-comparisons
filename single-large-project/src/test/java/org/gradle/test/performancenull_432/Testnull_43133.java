package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43133 {
    private final Productionnull_43133 production = new Productionnull_43133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}