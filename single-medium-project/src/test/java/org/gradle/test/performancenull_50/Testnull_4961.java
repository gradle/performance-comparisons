package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4961 {
    private final Productionnull_4961 production = new Productionnull_4961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}