package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42275 {
    private final Productionnull_42275 production = new Productionnull_42275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}