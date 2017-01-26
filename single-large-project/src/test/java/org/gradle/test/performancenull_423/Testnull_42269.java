package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42269 {
    private final Productionnull_42269 production = new Productionnull_42269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}