package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14002 {
    private final Productionnull_14002 production = new Productionnull_14002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}