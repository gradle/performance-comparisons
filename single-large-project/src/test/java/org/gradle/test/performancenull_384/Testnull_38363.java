package org.gradle.test.performancenull_384;

import static org.junit.Assert.*;

public class Testnull_38363 {
    private final Productionnull_38363 production = new Productionnull_38363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}