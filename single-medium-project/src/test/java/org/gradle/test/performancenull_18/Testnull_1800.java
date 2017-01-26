package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1800 {
    private final Productionnull_1800 production = new Productionnull_1800("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}