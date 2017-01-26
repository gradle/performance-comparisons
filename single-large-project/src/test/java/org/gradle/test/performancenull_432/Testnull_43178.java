package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43178 {
    private final Productionnull_43178 production = new Productionnull_43178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}