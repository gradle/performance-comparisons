package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4991 {
    private final Productionnull_4991 production = new Productionnull_4991("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}