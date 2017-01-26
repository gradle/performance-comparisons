package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_5000 {
    private final Productionnull_5000 production = new Productionnull_5000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}