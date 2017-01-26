package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31908 {
    private final Productionnull_31908 production = new Productionnull_31908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}