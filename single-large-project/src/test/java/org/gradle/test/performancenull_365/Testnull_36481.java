package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36481 {
    private final Productionnull_36481 production = new Productionnull_36481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}