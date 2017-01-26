package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38476 {
    private final Productionnull_38476 production = new Productionnull_38476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}