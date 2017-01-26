package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42273 {
    private final Productionnull_42273 production = new Productionnull_42273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}