package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_21 {
    private final Productionnull_21 production = new Productionnull_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}