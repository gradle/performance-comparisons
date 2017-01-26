package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20582 {
    private final Productionnull_20582 production = new Productionnull_20582("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}