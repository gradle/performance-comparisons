package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43497 {
    private final Productionnull_43497 production = new Productionnull_43497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}