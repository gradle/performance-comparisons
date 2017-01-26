package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1473 {
    private final Productionnull_1473 production = new Productionnull_1473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}