package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20348 {
    private final Productionnull_20348 production = new Productionnull_20348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}