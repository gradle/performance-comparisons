package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7946 {
    private final Productionnull_7946 production = new Productionnull_7946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}