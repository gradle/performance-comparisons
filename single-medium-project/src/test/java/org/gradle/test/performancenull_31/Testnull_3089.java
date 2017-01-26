package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3089 {
    private final Productionnull_3089 production = new Productionnull_3089("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}