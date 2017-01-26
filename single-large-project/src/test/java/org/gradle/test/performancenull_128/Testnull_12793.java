package org.gradle.test.performancenull_128;

import static org.junit.Assert.*;

public class Testnull_12793 {
    private final Productionnull_12793 production = new Productionnull_12793("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}