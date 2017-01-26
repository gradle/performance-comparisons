package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17446 {
    private final Productionnull_17446 production = new Productionnull_17446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}