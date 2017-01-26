package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12954 {
    private final Productionnull_12954 production = new Productionnull_12954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}