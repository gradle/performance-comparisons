package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2428 {
    private final Productionnull_2428 production = new Productionnull_2428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}