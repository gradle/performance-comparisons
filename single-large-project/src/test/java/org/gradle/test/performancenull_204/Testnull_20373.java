package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20373 {
    private final Productionnull_20373 production = new Productionnull_20373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}