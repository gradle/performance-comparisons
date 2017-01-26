package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43190 {
    private final Productionnull_43190 production = new Productionnull_43190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}