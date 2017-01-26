package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3051 {
    private final Productionnull_3051 production = new Productionnull_3051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}