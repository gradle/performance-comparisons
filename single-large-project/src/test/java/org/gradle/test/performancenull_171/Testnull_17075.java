package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17075 {
    private final Productionnull_17075 production = new Productionnull_17075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}