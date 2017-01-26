package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19937 {
    private final Productionnull_19937 production = new Productionnull_19937("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}