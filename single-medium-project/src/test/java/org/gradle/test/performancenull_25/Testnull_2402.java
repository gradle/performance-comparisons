package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2402 {
    private final Productionnull_2402 production = new Productionnull_2402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}