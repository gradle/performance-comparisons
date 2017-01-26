package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7463 {
    private final Productionnull_7463 production = new Productionnull_7463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}