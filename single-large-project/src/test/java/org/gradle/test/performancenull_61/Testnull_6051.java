package org.gradle.test.performancenull_61;

import static org.junit.Assert.*;

public class Testnull_6051 {
    private final Productionnull_6051 production = new Productionnull_6051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}