package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1935 {
    private final Productionnull_1935 production = new Productionnull_1935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}