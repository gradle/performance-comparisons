package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17913 {
    private final Productionnull_17913 production = new Productionnull_17913("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}