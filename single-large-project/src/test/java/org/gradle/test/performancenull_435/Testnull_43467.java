package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43467 {
    private final Productionnull_43467 production = new Productionnull_43467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}