package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36395 {
    private final Productionnull_36395 production = new Productionnull_36395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}