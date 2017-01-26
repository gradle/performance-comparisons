package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30262 {
    private final Productionnull_30262 production = new Productionnull_30262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}