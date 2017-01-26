package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20009 {
    private final Productionnull_20009 production = new Productionnull_20009("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}