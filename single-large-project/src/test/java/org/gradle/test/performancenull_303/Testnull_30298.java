package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30298 {
    private final Productionnull_30298 production = new Productionnull_30298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}