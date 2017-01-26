package org.gradle.test.performancenull_353;

import static org.junit.Assert.*;

public class Testnull_35262 {
    private final Productionnull_35262 production = new Productionnull_35262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}