package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22066 {
    private final Productionnull_22066 production = new Productionnull_22066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}