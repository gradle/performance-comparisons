package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43465 {
    private final Productionnull_43465 production = new Productionnull_43465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}