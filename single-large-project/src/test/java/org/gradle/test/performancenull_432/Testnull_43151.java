package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43151 {
    private final Productionnull_43151 production = new Productionnull_43151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}