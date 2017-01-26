package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21119 {
    private final Productionnull_21119 production = new Productionnull_21119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}