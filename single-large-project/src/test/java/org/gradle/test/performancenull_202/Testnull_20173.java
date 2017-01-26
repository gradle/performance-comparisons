package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20173 {
    private final Productionnull_20173 production = new Productionnull_20173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}