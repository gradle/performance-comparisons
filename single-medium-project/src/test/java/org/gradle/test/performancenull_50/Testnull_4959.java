package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4959 {
    private final Productionnull_4959 production = new Productionnull_4959("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}