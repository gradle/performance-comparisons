package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21177 {
    private final Productionnull_21177 production = new Productionnull_21177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}