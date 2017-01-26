package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24991 {
    private final Productionnull_24991 production = new Productionnull_24991("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}