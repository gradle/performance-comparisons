package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21528 {
    private final Productionnull_21528 production = new Productionnull_21528("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}