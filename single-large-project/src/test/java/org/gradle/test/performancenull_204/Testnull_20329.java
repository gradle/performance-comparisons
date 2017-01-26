package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20329 {
    private final Productionnull_20329 production = new Productionnull_20329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}