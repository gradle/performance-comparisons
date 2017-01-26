package org.gradle.test.performancenull_133;

import static org.junit.Assert.*;

public class Testnull_13290 {
    private final Productionnull_13290 production = new Productionnull_13290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}