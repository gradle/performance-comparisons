package org.gradle.test.performancenull_334;

import static org.junit.Assert.*;

public class Testnull_33398 {
    private final Productionnull_33398 production = new Productionnull_33398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}