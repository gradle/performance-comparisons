package org.gradle.test.performancenull_104;

import static org.junit.Assert.*;

public class Testnull_10400 {
    private final Productionnull_10400 production = new Productionnull_10400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}