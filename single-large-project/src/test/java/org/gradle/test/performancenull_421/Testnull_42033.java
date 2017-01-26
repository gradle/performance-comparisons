package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42033 {
    private final Productionnull_42033 production = new Productionnull_42033("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}