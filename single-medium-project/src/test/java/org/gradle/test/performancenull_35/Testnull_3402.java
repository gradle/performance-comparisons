package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3402 {
    private final Productionnull_3402 production = new Productionnull_3402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}