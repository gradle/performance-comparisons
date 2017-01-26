package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40095 {
    private final Productionnull_40095 production = new Productionnull_40095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}