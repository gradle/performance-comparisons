package org.gradle.test.performancenull_480;

import static org.junit.Assert.*;

public class Testnull_47955 {
    private final Productionnull_47955 production = new Productionnull_47955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}