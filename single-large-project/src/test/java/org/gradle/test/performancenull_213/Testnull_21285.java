package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21285 {
    private final Productionnull_21285 production = new Productionnull_21285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}