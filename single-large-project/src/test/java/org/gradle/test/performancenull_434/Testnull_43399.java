package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43399 {
    private final Productionnull_43399 production = new Productionnull_43399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}