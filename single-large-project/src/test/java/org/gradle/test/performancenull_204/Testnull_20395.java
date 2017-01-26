package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20395 {
    private final Productionnull_20395 production = new Productionnull_20395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}