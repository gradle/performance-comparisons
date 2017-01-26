package org.gradle.test.performancenull_11;

import static org.junit.Assert.*;

public class Testnull_1089 {
    private final Productionnull_1089 production = new Productionnull_1089("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}