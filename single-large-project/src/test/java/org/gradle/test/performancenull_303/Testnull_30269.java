package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30269 {
    private final Productionnull_30269 production = new Productionnull_30269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}