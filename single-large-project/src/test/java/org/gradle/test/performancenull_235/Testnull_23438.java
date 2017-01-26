package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23438 {
    private final Productionnull_23438 production = new Productionnull_23438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}