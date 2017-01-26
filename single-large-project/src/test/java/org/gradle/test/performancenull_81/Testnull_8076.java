package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8076 {
    private final Productionnull_8076 production = new Productionnull_8076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}