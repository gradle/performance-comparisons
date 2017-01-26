package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28044 {
    private final Productionnull_28044 production = new Productionnull_28044("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}