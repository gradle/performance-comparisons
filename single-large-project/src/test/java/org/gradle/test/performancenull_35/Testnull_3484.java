package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3484 {
    private final Productionnull_3484 production = new Productionnull_3484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}