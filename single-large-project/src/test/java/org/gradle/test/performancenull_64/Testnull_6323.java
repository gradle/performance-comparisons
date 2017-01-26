package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6323 {
    private final Productionnull_6323 production = new Productionnull_6323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}