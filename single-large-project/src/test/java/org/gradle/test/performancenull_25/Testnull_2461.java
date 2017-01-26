package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2461 {
    private final Productionnull_2461 production = new Productionnull_2461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}