package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30244 {
    private final Productionnull_30244 production = new Productionnull_30244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}