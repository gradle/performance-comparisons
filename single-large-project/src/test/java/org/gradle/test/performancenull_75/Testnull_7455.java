package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7455 {
    private final Productionnull_7455 production = new Productionnull_7455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}