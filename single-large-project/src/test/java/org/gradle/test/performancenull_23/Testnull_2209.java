package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2209 {
    private final Productionnull_2209 production = new Productionnull_2209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}