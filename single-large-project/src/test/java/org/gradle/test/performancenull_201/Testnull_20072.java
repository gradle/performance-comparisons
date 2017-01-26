package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20072 {
    private final Productionnull_20072 production = new Productionnull_20072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}