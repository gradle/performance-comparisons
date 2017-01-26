package org.gradle.test.performancenull_13;

import static org.junit.Assert.*;

public class Testnull_1283 {
    private final Productionnull_1283 production = new Productionnull_1283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}