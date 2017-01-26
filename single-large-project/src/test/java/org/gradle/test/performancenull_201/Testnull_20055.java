package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20055 {
    private final Productionnull_20055 production = new Productionnull_20055("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}