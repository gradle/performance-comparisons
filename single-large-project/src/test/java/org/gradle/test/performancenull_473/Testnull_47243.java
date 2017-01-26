package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47243 {
    private final Productionnull_47243 production = new Productionnull_47243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}