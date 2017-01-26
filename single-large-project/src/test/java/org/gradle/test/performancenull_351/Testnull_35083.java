package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35083 {
    private final Productionnull_35083 production = new Productionnull_35083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}