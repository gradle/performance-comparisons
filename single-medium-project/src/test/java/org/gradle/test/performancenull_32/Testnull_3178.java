package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3178 {
    private final Productionnull_3178 production = new Productionnull_3178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}