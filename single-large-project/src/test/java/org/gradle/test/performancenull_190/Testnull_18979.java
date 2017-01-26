package org.gradle.test.performancenull_190;

import static org.junit.Assert.*;

public class Testnull_18979 {
    private final Productionnull_18979 production = new Productionnull_18979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}