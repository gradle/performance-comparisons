package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21380 {
    private final Productionnull_21380 production = new Productionnull_21380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}