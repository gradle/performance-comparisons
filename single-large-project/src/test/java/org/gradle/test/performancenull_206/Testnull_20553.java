package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20553 {
    private final Productionnull_20553 production = new Productionnull_20553("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}