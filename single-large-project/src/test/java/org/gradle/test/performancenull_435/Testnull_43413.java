package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43413 {
    private final Productionnull_43413 production = new Productionnull_43413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}