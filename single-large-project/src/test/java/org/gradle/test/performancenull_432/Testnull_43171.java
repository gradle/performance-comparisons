package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43171 {
    private final Productionnull_43171 production = new Productionnull_43171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}