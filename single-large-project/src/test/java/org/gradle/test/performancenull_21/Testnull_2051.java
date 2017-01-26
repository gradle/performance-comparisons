package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2051 {
    private final Productionnull_2051 production = new Productionnull_2051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}