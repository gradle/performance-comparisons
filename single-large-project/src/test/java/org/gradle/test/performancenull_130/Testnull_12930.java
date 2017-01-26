package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12930 {
    private final Productionnull_12930 production = new Productionnull_12930("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}