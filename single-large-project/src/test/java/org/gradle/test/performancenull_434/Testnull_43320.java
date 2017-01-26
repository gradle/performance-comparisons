package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43320 {
    private final Productionnull_43320 production = new Productionnull_43320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}