package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43170 {
    private final Productionnull_43170 production = new Productionnull_43170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}