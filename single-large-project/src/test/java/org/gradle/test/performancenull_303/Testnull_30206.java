package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30206 {
    private final Productionnull_30206 production = new Productionnull_30206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}