package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11095 {
    private final Productionnull_11095 production = new Productionnull_11095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}