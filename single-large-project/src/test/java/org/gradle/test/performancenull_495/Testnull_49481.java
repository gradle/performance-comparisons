package org.gradle.test.performancenull_495;

import static org.junit.Assert.*;

public class Testnull_49481 {
    private final Productionnull_49481 production = new Productionnull_49481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}