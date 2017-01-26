package org.gradle.test.performancenull_13;

import static org.junit.Assert.*;

public class Testnull_1285 {
    private final Productionnull_1285 production = new Productionnull_1285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}