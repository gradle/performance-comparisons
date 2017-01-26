package org.gradle.test.performancenull_165;

import static org.junit.Assert.*;

public class Testnull_16462 {
    private final Productionnull_16462 production = new Productionnull_16462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}