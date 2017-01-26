package org.gradle.test.performancenull_298;

import static org.junit.Assert.*;

public class Testnull_29786 {
    private final Productionnull_29786 production = new Productionnull_29786("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}