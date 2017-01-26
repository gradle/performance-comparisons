package org.gradle.test.performancenull_247;

import static org.junit.Assert.*;

public class Testnull_24603 {
    private final Productionnull_24603 production = new Productionnull_24603("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}