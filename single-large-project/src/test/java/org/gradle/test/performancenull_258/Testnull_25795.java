package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25795 {
    private final Productionnull_25795 production = new Productionnull_25795("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}