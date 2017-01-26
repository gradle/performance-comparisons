package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36790 {
    private final Productionnull_36790 production = new Productionnull_36790("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}