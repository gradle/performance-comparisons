package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42277 {
    private final Productionnull_42277 production = new Productionnull_42277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}