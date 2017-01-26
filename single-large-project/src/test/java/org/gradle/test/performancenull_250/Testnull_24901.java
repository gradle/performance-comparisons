package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24901 {
    private final Productionnull_24901 production = new Productionnull_24901("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}