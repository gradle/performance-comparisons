package org.gradle.test.performancenull_243;

import static org.junit.Assert.*;

public class Testnull_24266 {
    private final Productionnull_24266 production = new Productionnull_24266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}