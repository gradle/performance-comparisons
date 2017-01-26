package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43391 {
    private final Productionnull_43391 production = new Productionnull_43391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}