package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43368 {
    private final Productionnull_43368 production = new Productionnull_43368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}