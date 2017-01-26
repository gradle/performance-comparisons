package org.gradle.test.performancenull_174;

import static org.junit.Assert.*;

public class Testnull_17348 {
    private final Productionnull_17348 production = new Productionnull_17348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}