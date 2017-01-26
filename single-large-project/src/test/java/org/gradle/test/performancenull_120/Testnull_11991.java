package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11991 {
    private final Productionnull_11991 production = new Productionnull_11991("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}