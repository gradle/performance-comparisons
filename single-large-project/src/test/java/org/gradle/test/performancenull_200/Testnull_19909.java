package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19909 {
    private final Productionnull_19909 production = new Productionnull_19909("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}