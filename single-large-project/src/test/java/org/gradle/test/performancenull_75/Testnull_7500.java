package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7500 {
    private final Productionnull_7500 production = new Productionnull_7500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}