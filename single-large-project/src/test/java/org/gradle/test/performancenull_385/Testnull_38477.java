package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38477 {
    private final Productionnull_38477 production = new Productionnull_38477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}