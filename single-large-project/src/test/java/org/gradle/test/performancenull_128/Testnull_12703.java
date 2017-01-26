package org.gradle.test.performancenull_128;

import static org.junit.Assert.*;

public class Testnull_12703 {
    private final Productionnull_12703 production = new Productionnull_12703("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}