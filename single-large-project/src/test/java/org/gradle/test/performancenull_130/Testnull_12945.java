package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12945 {
    private final Productionnull_12945 production = new Productionnull_12945("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}