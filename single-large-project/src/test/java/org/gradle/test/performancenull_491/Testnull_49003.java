package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49003 {
    private final Productionnull_49003 production = new Productionnull_49003("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}