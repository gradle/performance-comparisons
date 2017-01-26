package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10943 {
    private final Productionnull_10943 production = new Productionnull_10943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}