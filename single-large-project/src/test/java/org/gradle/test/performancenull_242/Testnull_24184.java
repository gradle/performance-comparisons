package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24184 {
    private final Productionnull_24184 production = new Productionnull_24184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}