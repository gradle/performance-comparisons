package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4972 {
    private final Productionnull_4972 production = new Productionnull_4972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}