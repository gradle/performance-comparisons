package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35957 {
    private final Productionnull_35957 production = new Productionnull_35957("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}