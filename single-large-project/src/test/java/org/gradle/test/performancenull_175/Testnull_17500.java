package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17500 {
    private final Productionnull_17500 production = new Productionnull_17500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}