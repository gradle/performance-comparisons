package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42044 {
    private final Productionnull_42044 production = new Productionnull_42044("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}