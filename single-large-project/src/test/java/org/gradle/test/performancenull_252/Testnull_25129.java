package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25129 {
    private final Productionnull_25129 production = new Productionnull_25129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}