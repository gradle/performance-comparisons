package org.gradle.test.performancenull_233;

import static org.junit.Assert.*;

public class Testnull_23260 {
    private final Productionnull_23260 production = new Productionnull_23260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}