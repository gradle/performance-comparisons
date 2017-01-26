package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10262 {
    private final Productionnull_10262 production = new Productionnull_10262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}