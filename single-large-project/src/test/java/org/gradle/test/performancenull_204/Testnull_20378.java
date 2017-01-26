package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20378 {
    private final Productionnull_20378 production = new Productionnull_20378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}