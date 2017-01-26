package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3285 {
    private final Productionnull_3285 production = new Productionnull_3285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}