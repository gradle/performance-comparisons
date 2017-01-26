package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30228 {
    private final Productionnull_30228 production = new Productionnull_30228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}