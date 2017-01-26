package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36364 {
    private final Productionnull_36364 production = new Productionnull_36364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}