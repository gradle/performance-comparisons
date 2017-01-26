package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43363 {
    private final Productionnull_43363 production = new Productionnull_43363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}