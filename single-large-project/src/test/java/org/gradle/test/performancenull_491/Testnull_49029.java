package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49029 {
    private final Productionnull_49029 production = new Productionnull_49029("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}