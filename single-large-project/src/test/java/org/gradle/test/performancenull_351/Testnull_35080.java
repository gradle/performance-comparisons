package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35080 {
    private final Productionnull_35080 production = new Productionnull_35080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}