package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35062 {
    private final Productionnull_35062 production = new Productionnull_35062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}