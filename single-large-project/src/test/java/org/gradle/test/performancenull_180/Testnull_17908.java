package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17908 {
    private final Productionnull_17908 production = new Productionnull_17908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}