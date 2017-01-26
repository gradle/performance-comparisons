package org.gradle.test.performancenull_262;

import static org.junit.Assert.*;

public class Testnull_26103 {
    private final Productionnull_26103 production = new Productionnull_26103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}