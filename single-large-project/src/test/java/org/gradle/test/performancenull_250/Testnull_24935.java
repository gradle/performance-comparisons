package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24935 {
    private final Productionnull_24935 production = new Productionnull_24935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}