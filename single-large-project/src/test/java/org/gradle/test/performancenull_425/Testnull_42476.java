package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42476 {
    private final Productionnull_42476 production = new Productionnull_42476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}