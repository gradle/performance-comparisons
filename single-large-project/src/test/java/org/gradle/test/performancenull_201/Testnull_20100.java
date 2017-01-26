package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20100 {
    private final Productionnull_20100 production = new Productionnull_20100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}