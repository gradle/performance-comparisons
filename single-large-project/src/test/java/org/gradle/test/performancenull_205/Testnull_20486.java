package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20486 {
    private final Productionnull_20486 production = new Productionnull_20486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}