package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20002 {
    private final Productionnull_20002 production = new Productionnull_20002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}