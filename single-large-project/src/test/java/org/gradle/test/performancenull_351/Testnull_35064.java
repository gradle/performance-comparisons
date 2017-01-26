package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35064 {
    private final Productionnull_35064 production = new Productionnull_35064("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}