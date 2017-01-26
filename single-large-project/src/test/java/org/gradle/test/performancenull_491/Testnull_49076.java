package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49076 {
    private final Productionnull_49076 production = new Productionnull_49076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}