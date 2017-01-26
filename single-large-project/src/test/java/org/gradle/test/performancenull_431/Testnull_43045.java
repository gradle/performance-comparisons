package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43045 {
    private final Productionnull_43045 production = new Productionnull_43045("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}