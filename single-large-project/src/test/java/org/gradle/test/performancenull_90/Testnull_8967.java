package org.gradle.test.performancenull_90;

import static org.junit.Assert.*;

public class Testnull_8967 {
    private final Productionnull_8967 production = new Productionnull_8967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}