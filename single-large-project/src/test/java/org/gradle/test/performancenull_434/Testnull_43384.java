package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43384 {
    private final Productionnull_43384 production = new Productionnull_43384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}