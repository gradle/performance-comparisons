package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47260 {
    private final Productionnull_47260 production = new Productionnull_47260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}