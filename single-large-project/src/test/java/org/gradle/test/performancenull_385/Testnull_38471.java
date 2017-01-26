package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38471 {
    private final Productionnull_38471 production = new Productionnull_38471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}