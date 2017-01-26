package org.gradle.test.performancenull_173;

import static org.junit.Assert.*;

public class Testnull_17243 {
    private final Productionnull_17243 production = new Productionnull_17243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}