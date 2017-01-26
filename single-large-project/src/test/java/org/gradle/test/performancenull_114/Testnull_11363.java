package org.gradle.test.performancenull_114;

import static org.junit.Assert.*;

public class Testnull_11363 {
    private final Productionnull_11363 production = new Productionnull_11363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}