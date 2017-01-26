package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38496 {
    private final Productionnull_38496 production = new Productionnull_38496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}