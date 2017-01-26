package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36251 {
    private final Productionnull_36251 production = new Productionnull_36251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}