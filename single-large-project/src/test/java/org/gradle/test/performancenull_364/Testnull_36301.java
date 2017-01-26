package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36301 {
    private final Productionnull_36301 production = new Productionnull_36301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}