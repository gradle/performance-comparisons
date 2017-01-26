package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20479 {
    private final Productionnull_20479 production = new Productionnull_20479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}