package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35091 {
    private final Productionnull_35091 production = new Productionnull_35091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}