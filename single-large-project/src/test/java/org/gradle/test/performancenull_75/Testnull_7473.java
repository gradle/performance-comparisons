package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7473 {
    private final Productionnull_7473 production = new Productionnull_7473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}