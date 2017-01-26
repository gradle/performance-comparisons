package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43381 {
    private final Productionnull_43381 production = new Productionnull_43381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}