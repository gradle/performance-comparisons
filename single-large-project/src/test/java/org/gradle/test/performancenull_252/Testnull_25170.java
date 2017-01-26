package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25170 {
    private final Productionnull_25170 production = new Productionnull_25170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}