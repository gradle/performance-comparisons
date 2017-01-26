package org.gradle.test.performancenull_142;

import static org.junit.Assert.*;

public class Testnull_14200 {
    private final Productionnull_14200 production = new Productionnull_14200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}