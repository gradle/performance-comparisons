package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35069 {
    private final Productionnull_35069 production = new Productionnull_35069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}