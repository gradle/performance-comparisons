package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48500 {
    private final Productionnull_48500 production = new Productionnull_48500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}