package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47296 {
    private final Productionnull_47296 production = new Productionnull_47296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}