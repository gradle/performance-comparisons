package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6321 {
    private final Productionnull_6321 production = new Productionnull_6321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}