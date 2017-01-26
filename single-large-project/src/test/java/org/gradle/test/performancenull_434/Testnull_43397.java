package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43397 {
    private final Productionnull_43397 production = new Productionnull_43397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}