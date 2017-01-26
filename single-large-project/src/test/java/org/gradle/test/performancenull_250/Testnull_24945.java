package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24945 {
    private final Productionnull_24945 production = new Productionnull_24945("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}