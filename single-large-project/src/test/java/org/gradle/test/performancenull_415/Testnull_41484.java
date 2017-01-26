package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41484 {
    private final Productionnull_41484 production = new Productionnull_41484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}