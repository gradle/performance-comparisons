package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43372 {
    private final Productionnull_43372 production = new Productionnull_43372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}