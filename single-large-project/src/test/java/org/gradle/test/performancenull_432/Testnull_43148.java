package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43148 {
    private final Productionnull_43148 production = new Productionnull_43148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}