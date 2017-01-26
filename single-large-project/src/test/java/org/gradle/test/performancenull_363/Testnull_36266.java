package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36266 {
    private final Productionnull_36266 production = new Productionnull_36266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}