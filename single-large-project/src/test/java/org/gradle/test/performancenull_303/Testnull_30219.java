package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30219 {
    private final Productionnull_30219 production = new Productionnull_30219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}