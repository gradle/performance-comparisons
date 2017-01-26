package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43188 {
    private final Productionnull_43188 production = new Productionnull_43188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}