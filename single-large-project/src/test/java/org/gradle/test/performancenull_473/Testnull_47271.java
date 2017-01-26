package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47271 {
    private final Productionnull_47271 production = new Productionnull_47271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}