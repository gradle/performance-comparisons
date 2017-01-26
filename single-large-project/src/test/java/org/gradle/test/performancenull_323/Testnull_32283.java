package org.gradle.test.performancenull_323;

import static org.junit.Assert.*;

public class Testnull_32283 {
    private final Productionnull_32283 production = new Productionnull_32283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}