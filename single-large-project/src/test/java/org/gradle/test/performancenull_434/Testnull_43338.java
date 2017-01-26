package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43338 {
    private final Productionnull_43338 production = new Productionnull_43338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}