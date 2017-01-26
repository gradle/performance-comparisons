package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21786 {
    private final Productionnull_21786 production = new Productionnull_21786("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}