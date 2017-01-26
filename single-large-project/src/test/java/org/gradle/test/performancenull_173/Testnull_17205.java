package org.gradle.test.performancenull_173;

import static org.junit.Assert.*;

public class Testnull_17205 {
    private final Productionnull_17205 production = new Productionnull_17205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}