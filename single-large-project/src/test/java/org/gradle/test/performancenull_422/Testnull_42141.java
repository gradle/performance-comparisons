package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42141 {
    private final Productionnull_42141 production = new Productionnull_42141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}