package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20003 {
    private final Productionnull_20003 production = new Productionnull_20003("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}