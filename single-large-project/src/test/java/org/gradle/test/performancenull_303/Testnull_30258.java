package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30258 {
    private final Productionnull_30258 production = new Productionnull_30258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}