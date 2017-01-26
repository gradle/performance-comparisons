package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24902 {
    private final Productionnull_24902 production = new Productionnull_24902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}