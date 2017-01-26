package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24178 {
    private final Productionnull_24178 production = new Productionnull_24178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}