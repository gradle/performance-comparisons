package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24983 {
    private final Productionnull_24983 production = new Productionnull_24983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}