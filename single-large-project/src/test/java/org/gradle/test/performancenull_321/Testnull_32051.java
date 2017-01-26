package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32051 {
    private final Productionnull_32051 production = new Productionnull_32051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}