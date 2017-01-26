package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42080 {
    private final Productionnull_42080 production = new Productionnull_42080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}