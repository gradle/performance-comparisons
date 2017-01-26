package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21073 {
    private final Productionnull_21073 production = new Productionnull_21073("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}