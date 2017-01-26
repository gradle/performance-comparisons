package org.gradle.test.performancenull_262;

import static org.junit.Assert.*;

public class Testnull_26122 {
    private final Productionnull_26122 production = new Productionnull_26122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}