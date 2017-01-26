package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17486 {
    private final Productionnull_17486 production = new Productionnull_17486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}