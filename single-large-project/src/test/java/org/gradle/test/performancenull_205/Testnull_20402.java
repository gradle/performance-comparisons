package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20402 {
    private final Productionnull_20402 production = new Productionnull_20402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}