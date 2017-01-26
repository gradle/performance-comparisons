package org.gradle.test.performancenull_223;

import static org.junit.Assert.*;

public class Testnull_22259 {
    private final Productionnull_22259 production = new Productionnull_22259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}