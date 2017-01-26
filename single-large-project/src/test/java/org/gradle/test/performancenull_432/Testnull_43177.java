package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43177 {
    private final Productionnull_43177 production = new Productionnull_43177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}