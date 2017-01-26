package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4913 {
    private final Productionnull_4913 production = new Productionnull_4913("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}