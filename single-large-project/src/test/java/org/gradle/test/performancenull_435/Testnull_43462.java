package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43462 {
    private final Productionnull_43462 production = new Productionnull_43462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}