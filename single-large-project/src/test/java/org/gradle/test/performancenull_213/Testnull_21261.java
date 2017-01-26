package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21261 {
    private final Productionnull_21261 production = new Productionnull_21261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}