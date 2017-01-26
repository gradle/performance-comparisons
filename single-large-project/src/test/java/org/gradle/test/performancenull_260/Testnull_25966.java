package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25966 {
    private final Productionnull_25966 production = new Productionnull_25966("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}