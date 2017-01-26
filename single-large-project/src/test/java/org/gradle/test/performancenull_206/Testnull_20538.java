package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20538 {
    private final Productionnull_20538 production = new Productionnull_20538("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}