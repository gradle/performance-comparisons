package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24952 {
    private final Productionnull_24952 production = new Productionnull_24952("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}