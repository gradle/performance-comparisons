package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35098 {
    private final Productionnull_35098 production = new Productionnull_35098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}