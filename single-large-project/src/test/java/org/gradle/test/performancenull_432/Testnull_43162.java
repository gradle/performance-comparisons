package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43162 {
    private final Productionnull_43162 production = new Productionnull_43162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}