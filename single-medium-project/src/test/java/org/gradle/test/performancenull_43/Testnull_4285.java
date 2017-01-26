package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4285 {
    private final Productionnull_4285 production = new Productionnull_4285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}