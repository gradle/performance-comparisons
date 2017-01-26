package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49960 {
    private final Productionnull_49960 production = new Productionnull_49960("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}