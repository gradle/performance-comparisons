package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38453 {
    private final Productionnull_38453 production = new Productionnull_38453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}