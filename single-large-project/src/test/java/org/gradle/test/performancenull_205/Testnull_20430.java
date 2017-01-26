package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20430 {
    private final Productionnull_20430 production = new Productionnull_20430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}