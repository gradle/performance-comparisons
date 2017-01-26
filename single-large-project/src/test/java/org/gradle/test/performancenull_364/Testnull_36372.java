package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36372 {
    private final Productionnull_36372 production = new Productionnull_36372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}