package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28095 {
    private final Productionnull_28095 production = new Productionnull_28095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}