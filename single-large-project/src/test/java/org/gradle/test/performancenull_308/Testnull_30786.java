package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30786 {
    private final Productionnull_30786 production = new Productionnull_30786("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}