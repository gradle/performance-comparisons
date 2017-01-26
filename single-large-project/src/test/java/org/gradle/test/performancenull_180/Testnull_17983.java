package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17983 {
    private final Productionnull_17983 production = new Productionnull_17983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}