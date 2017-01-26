package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12251 {
    private final Productionnull_12251 production = new Productionnull_12251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}