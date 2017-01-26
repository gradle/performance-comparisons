package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34279 {
    private final Productionnull_34279 production = new Productionnull_34279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}