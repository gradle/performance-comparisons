package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21878 {
    private final Productionnull_21878 production = new Productionnull_21878("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}