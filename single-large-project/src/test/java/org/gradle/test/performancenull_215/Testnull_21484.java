package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21484 {
    private final Productionnull_21484 production = new Productionnull_21484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}