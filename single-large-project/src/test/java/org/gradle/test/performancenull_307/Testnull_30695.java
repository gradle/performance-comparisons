package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30695 {
    private final Productionnull_30695 production = new Productionnull_30695("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}