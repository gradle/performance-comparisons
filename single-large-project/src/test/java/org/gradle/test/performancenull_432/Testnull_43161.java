package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43161 {
    private final Productionnull_43161 production = new Productionnull_43161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}