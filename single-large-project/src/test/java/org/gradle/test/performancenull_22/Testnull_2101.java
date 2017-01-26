package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2101 {
    private final Productionnull_2101 production = new Productionnull_2101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}