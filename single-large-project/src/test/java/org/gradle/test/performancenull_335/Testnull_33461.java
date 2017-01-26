package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33461 {
    private final Productionnull_33461 production = new Productionnull_33461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}