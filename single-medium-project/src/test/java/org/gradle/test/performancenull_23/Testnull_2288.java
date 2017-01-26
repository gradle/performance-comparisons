package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2288 {
    private final Productionnull_2288 production = new Productionnull_2288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}