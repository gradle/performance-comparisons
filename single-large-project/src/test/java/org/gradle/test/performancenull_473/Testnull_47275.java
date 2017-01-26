package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47275 {
    private final Productionnull_47275 production = new Productionnull_47275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}