package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12955 {
    private final Productionnull_12955 production = new Productionnull_12955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}