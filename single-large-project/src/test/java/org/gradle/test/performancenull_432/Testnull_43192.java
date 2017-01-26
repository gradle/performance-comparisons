package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43192 {
    private final Productionnull_43192 production = new Productionnull_43192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}