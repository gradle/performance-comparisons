package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17404 {
    private final Productionnull_17404 production = new Productionnull_17404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}