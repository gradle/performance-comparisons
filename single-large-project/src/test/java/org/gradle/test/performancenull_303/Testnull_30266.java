package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30266 {
    private final Productionnull_30266 production = new Productionnull_30266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}