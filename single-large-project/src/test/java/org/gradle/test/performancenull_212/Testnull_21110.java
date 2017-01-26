package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21110 {
    private final Productionnull_21110 production = new Productionnull_21110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}