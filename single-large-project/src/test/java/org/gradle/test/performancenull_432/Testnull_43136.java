package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43136 {
    private final Productionnull_43136 production = new Productionnull_43136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}