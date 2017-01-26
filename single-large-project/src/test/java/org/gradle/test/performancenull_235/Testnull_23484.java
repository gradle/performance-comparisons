package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23484 {
    private final Productionnull_23484 production = new Productionnull_23484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}