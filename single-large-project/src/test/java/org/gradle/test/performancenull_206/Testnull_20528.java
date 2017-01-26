package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20528 {
    private final Productionnull_20528 production = new Productionnull_20528("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}