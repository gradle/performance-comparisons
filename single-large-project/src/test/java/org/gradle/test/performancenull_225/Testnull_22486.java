package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22486 {
    private final Productionnull_22486 production = new Productionnull_22486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}