package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30044 {
    private final Productionnull_30044 production = new Productionnull_30044("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}