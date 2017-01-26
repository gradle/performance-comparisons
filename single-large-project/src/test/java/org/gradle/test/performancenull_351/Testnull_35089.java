package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35089 {
    private final Productionnull_35089 production = new Productionnull_35089("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}