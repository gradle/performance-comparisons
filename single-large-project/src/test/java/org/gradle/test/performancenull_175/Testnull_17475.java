package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17475 {
    private final Productionnull_17475 production = new Productionnull_17475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}