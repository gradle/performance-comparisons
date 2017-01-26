package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30242 {
    private final Productionnull_30242 production = new Productionnull_30242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}