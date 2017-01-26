package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4269 {
    private final Productionnull_4269 production = new Productionnull_4269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}