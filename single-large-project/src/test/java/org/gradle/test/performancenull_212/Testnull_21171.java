package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21171 {
    private final Productionnull_21171 production = new Productionnull_21171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}