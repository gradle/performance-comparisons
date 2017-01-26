package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21193 {
    private final Productionnull_21193 production = new Productionnull_21193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}