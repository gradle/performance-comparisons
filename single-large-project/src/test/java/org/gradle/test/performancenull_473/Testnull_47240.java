package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47240 {
    private final Productionnull_47240 production = new Productionnull_47240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}