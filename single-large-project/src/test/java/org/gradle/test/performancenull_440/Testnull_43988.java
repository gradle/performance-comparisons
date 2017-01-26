package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43988 {
    private final Productionnull_43988 production = new Productionnull_43988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}