package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20124 {
    private final Productionnull_20124 production = new Productionnull_20124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}