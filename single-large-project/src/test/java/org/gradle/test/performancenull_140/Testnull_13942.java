package org.gradle.test.performancenull_140;

import static org.junit.Assert.*;

public class Testnull_13942 {
    private final Productionnull_13942 production = new Productionnull_13942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}