package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30263 {
    private final Productionnull_30263 production = new Productionnull_30263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}