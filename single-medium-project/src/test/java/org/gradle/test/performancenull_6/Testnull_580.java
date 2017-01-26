package org.gradle.test.performancenull_6;

import static org.junit.Assert.*;

public class Testnull_580 {
    private final Productionnull_580 production = new Productionnull_580("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}