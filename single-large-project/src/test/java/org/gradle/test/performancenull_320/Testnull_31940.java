package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31940 {
    private final Productionnull_31940 production = new Productionnull_31940("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}