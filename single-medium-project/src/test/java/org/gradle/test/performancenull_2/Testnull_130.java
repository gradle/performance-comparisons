package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_130 {
    private final Productionnull_130 production = new Productionnull_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}