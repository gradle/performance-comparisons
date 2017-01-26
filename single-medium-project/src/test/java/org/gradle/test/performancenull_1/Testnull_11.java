package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_11 {
    private final Productionnull_11 production = new Productionnull_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}