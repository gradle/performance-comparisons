package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2492 {
    private final Productionnull_2492 production = new Productionnull_2492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}