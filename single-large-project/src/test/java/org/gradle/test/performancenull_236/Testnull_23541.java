package org.gradle.test.performancenull_236;

import static org.junit.Assert.*;

public class Testnull_23541 {
    private final Productionnull_23541 production = new Productionnull_23541("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}