package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2266 {
    private final Productionnull_2266 production = new Productionnull_2266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}