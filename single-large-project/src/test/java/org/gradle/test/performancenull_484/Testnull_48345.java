package org.gradle.test.performancenull_484;

import static org.junit.Assert.*;

public class Testnull_48345 {
    private final Productionnull_48345 production = new Productionnull_48345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}