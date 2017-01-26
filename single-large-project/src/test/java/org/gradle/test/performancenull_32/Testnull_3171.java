package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3171 {
    private final Productionnull_3171 production = new Productionnull_3171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}