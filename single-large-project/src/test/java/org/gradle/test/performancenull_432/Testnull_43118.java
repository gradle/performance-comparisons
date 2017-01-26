package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43118 {
    private final Productionnull_43118 production = new Productionnull_43118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}