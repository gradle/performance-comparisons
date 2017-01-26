package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40287 {
    private final Productionnull_40287 production = new Productionnull_40287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}