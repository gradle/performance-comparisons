package org.gradle.test.performancenull_248;

import static org.junit.Assert.*;

public class Testnull_24786 {
    private final Productionnull_24786 production = new Productionnull_24786("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}