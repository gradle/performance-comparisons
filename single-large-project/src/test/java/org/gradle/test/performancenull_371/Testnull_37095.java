package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37095 {
    private final Productionnull_37095 production = new Productionnull_37095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}