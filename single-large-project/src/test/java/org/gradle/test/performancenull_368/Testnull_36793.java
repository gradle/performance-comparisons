package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36793 {
    private final Productionnull_36793 production = new Productionnull_36793("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}