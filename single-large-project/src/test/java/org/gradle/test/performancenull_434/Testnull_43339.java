package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43339 {
    private final Productionnull_43339 production = new Productionnull_43339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}