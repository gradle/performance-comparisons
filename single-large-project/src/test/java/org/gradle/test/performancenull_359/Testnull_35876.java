package org.gradle.test.performancenull_359;

import static org.junit.Assert.*;

public class Testnull_35876 {
    private final Productionnull_35876 production = new Productionnull_35876("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}