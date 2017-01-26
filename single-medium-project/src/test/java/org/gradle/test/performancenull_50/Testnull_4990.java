package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4990 {
    private final Productionnull_4990 production = new Productionnull_4990("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}