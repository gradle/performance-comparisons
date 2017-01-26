package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2484 {
    private final Productionnull_2484 production = new Productionnull_2484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}