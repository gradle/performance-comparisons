package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47205 {
    private final Productionnull_47205 production = new Productionnull_47205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}