package org.gradle.test.performancenull_5;

import static org.junit.Assert.*;

public class Testnull_473 {
    private final Productionnull_473 production = new Productionnull_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}