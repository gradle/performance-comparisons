package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43108 {
    private final Productionnull_43108 production = new Productionnull_43108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}