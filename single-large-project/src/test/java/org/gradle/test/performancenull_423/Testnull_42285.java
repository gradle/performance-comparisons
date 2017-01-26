package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42285 {
    private final Productionnull_42285 production = new Productionnull_42285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}