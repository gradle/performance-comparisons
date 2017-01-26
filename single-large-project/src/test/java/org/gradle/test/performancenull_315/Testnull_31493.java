package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31493 {
    private final Productionnull_31493 production = new Productionnull_31493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}