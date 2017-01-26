package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24990 {
    private final Productionnull_24990 production = new Productionnull_24990("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}