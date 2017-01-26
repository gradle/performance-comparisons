package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18037 {
    private final Productionnull_18037 production = new Productionnull_18037("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}