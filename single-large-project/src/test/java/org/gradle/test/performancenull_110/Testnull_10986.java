package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10986 {
    private final Productionnull_10986 production = new Productionnull_10986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}