package org.gradle.test.performancenull_173;

import static org.junit.Assert.*;

public class Testnull_17283 {
    private final Productionnull_17283 production = new Productionnull_17283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}