package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18481 {
    private final Productionnull_18481 production = new Productionnull_18481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}