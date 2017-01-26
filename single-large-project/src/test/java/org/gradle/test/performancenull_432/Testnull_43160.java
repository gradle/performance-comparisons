package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43160 {
    private final Productionnull_43160 production = new Productionnull_43160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}