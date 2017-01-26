package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4262 {
    private final Productionnull_4262 production = new Productionnull_4262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}