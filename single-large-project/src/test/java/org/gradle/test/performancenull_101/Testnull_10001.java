package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10001 {
    private final Productionnull_10001 production = new Productionnull_10001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}