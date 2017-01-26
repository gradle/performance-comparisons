package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2409 {
    private final Productionnull_2409 production = new Productionnull_2409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}