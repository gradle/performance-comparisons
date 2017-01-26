package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32046 {
    private final Productionnull_32046 production = new Productionnull_32046("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}