package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4977 {
    private final Productionnull_4977 production = new Productionnull_4977("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}