package org.gradle.test.performancenull_169;

import static org.junit.Assert.*;

public class Testnull_16878 {
    private final Productionnull_16878 production = new Productionnull_16878("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}