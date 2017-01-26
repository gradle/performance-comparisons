package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43469 {
    private final Productionnull_43469 production = new Productionnull_43469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}