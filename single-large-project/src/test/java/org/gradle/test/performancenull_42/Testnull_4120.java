package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4120 {
    private final Productionnull_4120 production = new Productionnull_4120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}