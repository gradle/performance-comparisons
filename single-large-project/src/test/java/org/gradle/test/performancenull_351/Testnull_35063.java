package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35063 {
    private final Productionnull_35063 production = new Productionnull_35063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}