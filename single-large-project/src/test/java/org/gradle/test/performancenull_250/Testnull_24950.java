package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24950 {
    private final Productionnull_24950 production = new Productionnull_24950("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}