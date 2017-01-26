package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18165 {
    private final Productionnull_18165 production = new Productionnull_18165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}