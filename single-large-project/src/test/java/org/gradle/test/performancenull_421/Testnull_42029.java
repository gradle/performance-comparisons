package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42029 {
    private final Productionnull_42029 production = new Productionnull_42029("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}