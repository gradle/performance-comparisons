package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47295 {
    private final Productionnull_47295 production = new Productionnull_47295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}