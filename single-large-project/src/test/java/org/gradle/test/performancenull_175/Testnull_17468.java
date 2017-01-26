package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17468 {
    private final Productionnull_17468 production = new Productionnull_17468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}