package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30186 {
    private final Productionnull_30186 production = new Productionnull_30186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}