package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20053 {
    private final Productionnull_20053 production = new Productionnull_20053("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}