package org.gradle.test.performancenull_128;

import static org.junit.Assert.*;

public class Testnull_12786 {
    private final Productionnull_12786 production = new Productionnull_12786("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}