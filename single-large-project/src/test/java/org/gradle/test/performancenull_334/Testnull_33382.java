package org.gradle.test.performancenull_334;

import static org.junit.Assert.*;

public class Testnull_33382 {
    private final Productionnull_33382 production = new Productionnull_33382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}