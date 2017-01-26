package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1991 {
    private final Productionnull_1991 production = new Productionnull_1991("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}