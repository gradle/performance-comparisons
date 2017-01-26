package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47251 {
    private final Productionnull_47251 production = new Productionnull_47251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}