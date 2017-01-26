package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18277 {
    private final Productionnull_18277 production = new Productionnull_18277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}