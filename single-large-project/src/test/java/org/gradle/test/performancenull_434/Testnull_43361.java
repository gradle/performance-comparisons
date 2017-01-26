package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43361 {
    private final Productionnull_43361 production = new Productionnull_43361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}