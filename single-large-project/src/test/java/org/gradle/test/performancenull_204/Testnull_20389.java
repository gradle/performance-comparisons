package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20389 {
    private final Productionnull_20389 production = new Productionnull_20389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}