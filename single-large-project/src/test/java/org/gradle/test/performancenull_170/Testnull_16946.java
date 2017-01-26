package org.gradle.test.performancenull_170;

import static org.junit.Assert.*;

public class Testnull_16946 {
    private final Productionnull_16946 production = new Productionnull_16946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}