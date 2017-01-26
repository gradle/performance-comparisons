package org.gradle.test.performancenull_170;

import static org.junit.Assert.*;

public class Testnull_16935 {
    private final Productionnull_16935 production = new Productionnull_16935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}