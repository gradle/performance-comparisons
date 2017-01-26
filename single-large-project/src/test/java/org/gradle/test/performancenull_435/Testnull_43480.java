package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43480 {
    private final Productionnull_43480 production = new Productionnull_43480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}