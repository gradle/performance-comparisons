package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43354 {
    private final Productionnull_43354 production = new Productionnull_43354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}