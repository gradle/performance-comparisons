package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20042 {
    private final Productionnull_20042 production = new Productionnull_20042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}