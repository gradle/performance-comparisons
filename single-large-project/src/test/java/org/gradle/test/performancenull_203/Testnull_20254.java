package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20254 {
    private final Productionnull_20254 production = new Productionnull_20254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}