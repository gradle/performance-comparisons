package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20385 {
    private final Productionnull_20385 production = new Productionnull_20385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}