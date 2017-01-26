package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4969 {
    private final Productionnull_4969 production = new Productionnull_4969("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}