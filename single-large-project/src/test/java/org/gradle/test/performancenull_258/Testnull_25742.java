package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25742 {
    private final Productionnull_25742 production = new Productionnull_25742("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}