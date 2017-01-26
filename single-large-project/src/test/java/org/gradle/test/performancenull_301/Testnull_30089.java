package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30089 {
    private final Productionnull_30089 production = new Productionnull_30089("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}