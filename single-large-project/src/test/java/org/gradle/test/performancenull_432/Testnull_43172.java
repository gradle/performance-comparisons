package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43172 {
    private final Productionnull_43172 production = new Productionnull_43172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}