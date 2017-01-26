package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32023 {
    private final Productionnull_32023 production = new Productionnull_32023("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}