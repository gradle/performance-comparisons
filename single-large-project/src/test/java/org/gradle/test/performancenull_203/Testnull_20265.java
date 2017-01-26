package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20265 {
    private final Productionnull_20265 production = new Productionnull_20265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}