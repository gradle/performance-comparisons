package org.gradle.test.performancenull_262;

import static org.junit.Assert.*;

public class Testnull_26120 {
    private final Productionnull_26120 production = new Productionnull_26120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}