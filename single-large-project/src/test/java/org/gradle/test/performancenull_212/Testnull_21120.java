package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21120 {
    private final Productionnull_21120 production = new Productionnull_21120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}