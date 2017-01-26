package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12984 {
    private final Productionnull_12984 production = new Productionnull_12984("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}