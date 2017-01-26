package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47290 {
    private final Productionnull_47290 production = new Productionnull_47290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}