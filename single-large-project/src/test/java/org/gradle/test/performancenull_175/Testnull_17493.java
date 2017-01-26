package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17493 {
    private final Productionnull_17493 production = new Productionnull_17493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}