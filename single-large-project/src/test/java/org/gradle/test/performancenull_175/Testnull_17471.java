package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17471 {
    private final Productionnull_17471 production = new Productionnull_17471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}