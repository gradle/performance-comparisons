package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32088 {
    private final Productionnull_32088 production = new Productionnull_32088("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}