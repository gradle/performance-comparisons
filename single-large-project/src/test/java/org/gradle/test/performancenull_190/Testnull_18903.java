package org.gradle.test.performancenull_190;

import static org.junit.Assert.*;

public class Testnull_18903 {
    private final Productionnull_18903 production = new Productionnull_18903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}