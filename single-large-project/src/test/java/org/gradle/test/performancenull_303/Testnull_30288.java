package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30288 {
    private final Productionnull_30288 production = new Productionnull_30288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}