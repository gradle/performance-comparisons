package org.gradle.test.performancenull_243;

import static org.junit.Assert.*;

public class Testnull_24219 {
    private final Productionnull_24219 production = new Productionnull_24219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}