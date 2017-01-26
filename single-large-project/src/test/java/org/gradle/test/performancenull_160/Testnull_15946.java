package org.gradle.test.performancenull_160;

import static org.junit.Assert.*;

public class Testnull_15946 {
    private final Productionnull_15946 production = new Productionnull_15946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}