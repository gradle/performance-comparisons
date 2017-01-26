package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10946 {
    private final Productionnull_10946 production = new Productionnull_10946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}