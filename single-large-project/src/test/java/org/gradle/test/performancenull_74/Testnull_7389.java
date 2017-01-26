package org.gradle.test.performancenull_74;

import static org.junit.Assert.*;

public class Testnull_7389 {
    private final Productionnull_7389 production = new Productionnull_7389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}