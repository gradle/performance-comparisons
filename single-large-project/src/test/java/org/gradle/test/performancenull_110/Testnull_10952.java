package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10952 {
    private final Productionnull_10952 production = new Productionnull_10952("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}