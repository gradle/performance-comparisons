package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43166 {
    private final Productionnull_43166 production = new Productionnull_43166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}