package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24177 {
    private final Productionnull_24177 production = new Productionnull_24177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}