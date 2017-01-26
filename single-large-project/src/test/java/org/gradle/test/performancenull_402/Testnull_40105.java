package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40105 {
    private final Productionnull_40105 production = new Productionnull_40105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}