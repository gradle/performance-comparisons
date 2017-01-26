package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43159 {
    private final Productionnull_43159 production = new Productionnull_43159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}