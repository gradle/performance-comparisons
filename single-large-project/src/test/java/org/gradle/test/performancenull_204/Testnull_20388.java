package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20388 {
    private final Productionnull_20388 production = new Productionnull_20388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}