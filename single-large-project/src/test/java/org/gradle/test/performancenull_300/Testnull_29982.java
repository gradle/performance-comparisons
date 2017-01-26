package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29982 {
    private final Productionnull_29982 production = new Productionnull_29982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}