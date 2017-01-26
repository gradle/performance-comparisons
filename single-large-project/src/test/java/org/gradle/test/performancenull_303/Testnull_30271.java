package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30271 {
    private final Productionnull_30271 production = new Productionnull_30271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}