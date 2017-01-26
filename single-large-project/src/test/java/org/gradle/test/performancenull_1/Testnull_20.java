package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_20 {
    private final Productionnull_20 production = new Productionnull_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}