package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4870 {
    private final Productionnull_4870 production = new Productionnull_4870("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}