package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22075 {
    private final Productionnull_22075 production = new Productionnull_22075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}