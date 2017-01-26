package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35051 {
    private final Productionnull_35051 production = new Productionnull_35051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}