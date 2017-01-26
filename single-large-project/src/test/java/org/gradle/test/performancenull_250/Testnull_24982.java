package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24982 {
    private final Productionnull_24982 production = new Productionnull_24982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}