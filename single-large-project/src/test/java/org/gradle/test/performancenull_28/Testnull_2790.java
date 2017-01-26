package org.gradle.test.performancenull_28;

import static org.junit.Assert.*;

public class Testnull_2790 {
    private final Productionnull_2790 production = new Productionnull_2790("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}