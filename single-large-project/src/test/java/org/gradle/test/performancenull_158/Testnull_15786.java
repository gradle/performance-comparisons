package org.gradle.test.performancenull_158;

import static org.junit.Assert.*;

public class Testnull_15786 {
    private final Productionnull_15786 production = new Productionnull_15786("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}