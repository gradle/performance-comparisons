package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30285 {
    private final Productionnull_30285 production = new Productionnull_30285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}