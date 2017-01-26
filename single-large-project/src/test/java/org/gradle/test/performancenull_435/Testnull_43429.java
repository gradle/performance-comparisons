package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43429 {
    private final Productionnull_43429 production = new Productionnull_43429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}