package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36095 {
    private final Productionnull_36095 production = new Productionnull_36095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}