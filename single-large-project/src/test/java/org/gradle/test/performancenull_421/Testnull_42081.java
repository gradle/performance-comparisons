package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42081 {
    private final Productionnull_42081 production = new Productionnull_42081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}