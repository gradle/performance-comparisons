package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4279 {
    private final Productionnull_4279 production = new Productionnull_4279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}