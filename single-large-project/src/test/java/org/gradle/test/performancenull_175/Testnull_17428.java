package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17428 {
    private final Productionnull_17428 production = new Productionnull_17428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}