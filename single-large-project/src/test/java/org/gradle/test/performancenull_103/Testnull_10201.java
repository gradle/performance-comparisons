package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10201 {
    private final Productionnull_10201 production = new Productionnull_10201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}