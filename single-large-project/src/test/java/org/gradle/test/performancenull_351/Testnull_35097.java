package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35097 {
    private final Productionnull_35097 production = new Productionnull_35097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}