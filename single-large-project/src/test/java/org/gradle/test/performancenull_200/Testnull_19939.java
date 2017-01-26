package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19939 {
    private final Productionnull_19939 production = new Productionnull_19939("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}