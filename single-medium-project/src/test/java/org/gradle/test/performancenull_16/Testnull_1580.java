package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1580 {
    private final Productionnull_1580 production = new Productionnull_1580("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}