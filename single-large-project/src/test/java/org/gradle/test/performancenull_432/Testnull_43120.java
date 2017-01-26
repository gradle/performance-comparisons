package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43120 {
    private final Productionnull_43120 production = new Productionnull_43120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}