package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18110 {
    private final Productionnull_18110 production = new Productionnull_18110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}