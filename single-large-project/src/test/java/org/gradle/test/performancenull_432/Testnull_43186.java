package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43186 {
    private final Productionnull_43186 production = new Productionnull_43186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}