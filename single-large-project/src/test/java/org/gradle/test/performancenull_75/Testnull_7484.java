package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7484 {
    private final Productionnull_7484 production = new Productionnull_7484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}