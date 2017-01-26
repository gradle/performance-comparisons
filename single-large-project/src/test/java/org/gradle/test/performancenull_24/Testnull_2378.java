package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2378 {
    private final Productionnull_2378 production = new Productionnull_2378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}