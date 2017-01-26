package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43193 {
    private final Productionnull_43193 production = new Productionnull_43193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}