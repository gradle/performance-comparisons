package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35045 {
    private final Productionnull_35045 production = new Productionnull_35045("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}