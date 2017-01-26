package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47285 {
    private final Productionnull_47285 production = new Productionnull_47285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}