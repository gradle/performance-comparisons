package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43322 {
    private final Productionnull_43322 production = new Productionnull_43322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}