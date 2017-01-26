package org.gradle.test.performancenull_170;

import static org.junit.Assert.*;

public class Testnull_16979 {
    private final Productionnull_16979 production = new Productionnull_16979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}