package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20084 {
    private final Productionnull_20084 production = new Productionnull_20084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}