package org.gradle.test.performancenull_355;

import static org.junit.Assert.*;

public class Testnull_35428 {
    private final Productionnull_35428 production = new Productionnull_35428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}