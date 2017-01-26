package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43152 {
    private final Productionnull_43152 production = new Productionnull_43152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}