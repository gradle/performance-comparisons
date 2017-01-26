package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24914 {
    private final Productionnull_24914 production = new Productionnull_24914("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}