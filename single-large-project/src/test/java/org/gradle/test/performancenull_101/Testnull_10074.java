package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10074 {
    private final Productionnull_10074 production = new Productionnull_10074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}