package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21238 {
    private final Productionnull_21238 production = new Productionnull_21238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}