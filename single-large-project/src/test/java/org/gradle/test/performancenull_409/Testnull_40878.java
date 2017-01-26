package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40878 {
    private final Productionnull_40878 production = new Productionnull_40878("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}