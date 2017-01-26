package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6375 {
    private final Productionnull_6375 production = new Productionnull_6375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}