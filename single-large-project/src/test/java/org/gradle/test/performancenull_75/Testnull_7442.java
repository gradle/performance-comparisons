package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7442 {
    private final Productionnull_7442 production = new Productionnull_7442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}