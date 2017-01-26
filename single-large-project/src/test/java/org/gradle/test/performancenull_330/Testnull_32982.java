package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32982 {
    private final Productionnull_32982 production = new Productionnull_32982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}