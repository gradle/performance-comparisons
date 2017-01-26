package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30281 {
    private final Productionnull_30281 production = new Productionnull_30281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}